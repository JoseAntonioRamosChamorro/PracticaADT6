package practica;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		ApplicationContext appContext =	
				new ClassPathXmlApplicationContext("es/studium/xml/beans.xml");
		//direccion de ambos centros
		Centro cen1= (Centro) appContext.getBean("ing");
		Centro cen2= (Centro) appContext.getBean("fran");	
		
		
		System.out.println("La dirección del centro de ingles es "+cen1.getCentroDireccion()
		+" y la de frances es "+cen2.getCentroDireccion());
		
		
		//matriculacion Carmen
		Alumno carmen = (Alumno) appContext.getBean("Carmen");
		System.out.println(carmen.getAlumno()+" esta matriculada en "+cen1.getCentroNombre());
		
		
		//Nota Benito
		Alumno benito = (Alumno) appContext.getBean("Benito");
		
		System.out.println("La nota de Benito es "+benito.getNota());
	}
}
