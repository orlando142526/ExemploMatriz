
package exemplomatriz;

import javax.swing.JOptionPane;


public class ExemploMatriz {

    public static void main(String[] args) {
       int[][]matriz=new int[3][4];
       String[]alumnos={"alum1,alum2,alum3"};
       String[]modulos={"M1,M2,M2,M4"};
       int opcion;
       MetodosMatriz obx = new MetodosMatriz();
       do{
           opcion= Integer.parseInt(JOptionPane.showInputDialog("****MENU***\n 1--> crear Matriz\n 2--> amosar todo\n 3 Sair\n Teclea opcion"));
        
switch(opcion){
 case 1:
    matriz = obx.crearMatriz(matriz);
    break;
 case 2:
    obx.amosar(matriz);
    break;
 case 3:
     obx.amosarTodo(matriz, alumnos, modulos);
     break;
 case 4:
    obx.sair();
 }
}while(opcion<4);
        
}
    
}
           
     