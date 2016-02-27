/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2final;

/**
 *
 * @author LUISA-CAMILO
 */
public class Problema2Final {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        java.util.Scanner num=
                new java.util.Scanner(System.in);
        String nompasajero;
        String variable;
        int cedula;
        boolean [][] Avion = new boolean [12][7];
        String [][] Nombre= new String [12][7];
        int [][] Cedula =new int [12][7];
        Avion[0][2]=true;
        Avion[1][2]=true;
        Avion[0][4]=true;
        Avion[1][4]=true;
        for (int i =0;i<12;i++){
           for(int j=0;j<7;j++){            
            Avion[i][3]=true;
            Avion[2][j]=true;
            Avion[3][j]=true;
            Avion[4][j]=true;
            }        
        }
        System.out.println(" 1 clase ejecutiva,2 economica,3 avion");
        System.out.println("4 identificar con cedula silla de alguien,5 cuantas sillas vacias en economica");
        while(true) {
            int op = num.nextInt();
            switch(op) {
                case 1:
                    System.out.println("¿ventana o pasillo?");
                    variable=num.next();
                    System.out.println("ingrese el nombre del pasajero");
                    nompasajero=num.next();
                    System.out.println("ingrese la cedula del pasajero");
                    cedula=num.nextInt();
                    boolean x = false;
                    for(int i=0;i<2;i++){
                        for(int j=0;j<7;j++){
                            if(variable.equals("ventana")){
                                if(Avion[i][0]==false||Avion [i][6]==false){
                                Avion[i][j]=true;
                                Nombre[i][j]=nompasajero;
                                Cedula[i][j]=cedula;
                                x = true;
                                break;
                                }
                            }
                            if(variable.equals("pasillo")){
                                if(Avion[i][1]==false||Avion [i][5]==false){
                                Avion[i][1]=true;
                                Nombre[i][j]=nompasajero;
                                Cedula[i][j]=cedula;
                                x = true;
                                break;
                                }
                            }
                        }
                        if(x == true) {
                            break;
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("¿ventana , centro o pasillo?");
                    variable=num.next();
                    System.out.println("ingrese el nombre del pasajero");
                    nompasajero=num.next();
                    System.out.println("ingrese la cedula del pasajero");
                    cedula=num.nextInt();
                    boolean y = false;
                    for(int i=0;4<i||i<12;i++){
                        for(int j=0;j<7;j++){
                            if(variable.equals("ventana")){
                                if(Avion[i][0]==false||Avion [i][6]==false){
                                Avion[i+6][0]=true;
                                Nombre[i][j]=nompasajero;
                                Cedula[i][j]=cedula;
                                y = true;
                                break;
                                }
                            }
                            if(variable.equals("pasillo")){
                                if(Avion[i][2]==false||Avion [i][4]==false){
                                Avion[i+6][2]=true;                           
                                
                                Nombre[i][j]=nompasajero;
                                Cedula[i][j]=cedula;
                                y = true;
                                break;
                                }
                            }
                            if(variable.equals("centro")){
                                if(Avion[i][1]==false||Avion [i][5]==false){
                                Avion[i+6][1]=true;
                                Nombre[i][j]=nompasajero;
                                Cedula[i][j]=cedula;
                                y = true;
                                break;
                                }
                            }  
                        }
                        if(y == true) {
                            break;
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int sillasocupadas=0;                    
                    for(int i=0;i<12;i++){
                        for(int j=0;j<7;j++){
                            if(Avion[i][j]==true){
                            sillasocupadas++;                        
                            }
                        System.out.print(Avion[i][j]+"\t"); 
                        }
                    System.out.println();
                    }
                    System.out.print("la cantidad de sillas ocupadas es: "+(sillasocupadas-34));
                    break;
                case 4:
                    System.out.println("ingrese la cedula para ver ubicacion");
                    int cedulacomp= num.nextInt();
                    for(int i=0;i<12;i++){
                        for(int j=0;j<7;j++){
                           if(cedulacomp==Cedula[i][j]){                                                   
                            System.out.println(" el pasajero se encuentra en la silla:( "+i+";"+j+")");
                           break;
                           }                                                        
                        }                          
                    }
                    break;
                case 5:
                    int sillasvacias=0;
                    for(int i=0;4<i||i<12;i++){
                        for(int j=0;j<7;j++){
                            if (Avion[i][j]==false){
                                sillasvacias++;
                            }
                        }
                    }
                    System.out.println("la cantidad de sillas vacias en economica es: "+sillasvacias);
                    break;
                    default:
                    System.out.println("se ha cometido un error al ingresar algun dato");
                break;
            }
        }
    }
    
}