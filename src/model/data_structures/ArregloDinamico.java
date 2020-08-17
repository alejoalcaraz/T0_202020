package model.data_structures;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico<T extends Comparable<T>> implements IArregloDinamico<T>{

		/**
		 * Capacidad maxima del arreglo
		 */
        private int tamanoMax;
		/**
		 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
		 */
        private int tamanoAct;
        /**
         * Arreglo de elementos de tamaNo maximo
         */
        private T[] elementos;

        /**
         * Construir un arreglo con la capacidad maxima inicial.
         * @param max Capacidad maxima inicial
         */
		public ArregloDinamico( int max )
        {
			elementos = (T[]) new Object[tamanoMax];
               tamanoMax = max;
               tamanoAct = 0;
        }
        
		public void agregar( T dato )
        {
               if ( tamanoAct == tamanoMax )
               {  // caso de arreglo lleno (aumentar tamaNo)
                    tamanoMax = 2 * tamanoMax;
                    T[] copia = elementos;
                    elementos = (T[]) new Object[tamanoMax];
                    for ( int i = 0; i < tamanoAct; i++)
                    {
                     	 elementos[i] = copia[i];
                    } 
            	    System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
               }	
               elementos[tamanoAct] = dato;
               tamanoAct++;
       }

		public int darCapacidad() {
			return tamanoMax;
		}

		public int darTamano() {
			return tamanoAct;
		}

		public T darElemento(int i) {
			// TODO implementar
			if(i<tamanoAct)
			{
			return elementos[i];
			}
			else 
				return null;
		}

		public T buscar(T dato) {
			
			for(int i = 0 ; i<tamanoAct; i++)
			{
				if(dato.compareTo(elementos[i]) == 0)
				{
					return elementos[i];
				}
			}
			// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			return null;
		}

		public T eliminar(T dato) {
			
			int ubi = 0;
			T[] nuevo = (T[]) new Object[tamanoMax];
			for(int i = 0 ; i<tamanoAct; i++)
			{
				if(dato.compareTo(elementos[i]) == 0)
				{
					ubi = i;
					i = tamanoAct;
				}
				else
				{
					nuevo[i] = elementos[i];
				}
				
			}
			for(int i = ubi + 1; i<tamanoAct; i++)
			{
				nuevo[i-1] = elementos[i];
			}
			elementos = nuevo;
			--tamanoAct;
			
			// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			return dato;
		}

}
