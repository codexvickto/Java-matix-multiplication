// // import java.util.Scanner;
// // public class Hello
// // {
// //     public static void main(String[] args)
// //     {
// //         brain b =new brain();
// //         b.brains();
// //     }
// // }
// // class Matrix
// // {
// //     int[][] enterMatrix(int size)
// //     {
// //         int matrixx[][] = new int[size][size];
// //         Scanner scan = new Scanner(System.in);
// //         for(int i = 0; i < size; i++)
// //         {
// //             for(int j = 0; j < size; j++)
// //             {
// //                 matrixx[i][j] = scan.nextInt();
// //             }
// //         }
// //         return matrixx;
// //     }
// // }
// // class printMatrix
// // {
// //     void printMatrixx(int a1[][])
// //     {
// //         for(int i[]:a1)
// //         {
// //             for(int j:i)
// //             {
// //                 System.out.print(j + " ");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }
// // class claclution
// // {
// //     int[][] calclutionn(int a1[][], int a2[][], int size)
// //     {
// //         int [][] ar3= new int[size][size];
// //         for(int i=0; i<size; i++)
// //         {
// //             for(int j=0; j<size; j++)
// //             {
// //                 int a=0;
// //                 for(int k=0; k<size; k++)
// //                 {
// //                     a=a+a1[i][k]*a2[k][j];
// //                 }
// //                 ar3[i][j]=a;
// //             }
// //         }
// //         return ar3;
// //     }
// // }
// // class printans
// // {
// //     void printanss(int matrix1[][], int matrix2[][], int size)
// //     {
// //         claclution c = new claclution();
// //         int [][] a = new int[size][size];
// //         a=c.calclutionn(matrix1, matrix2, size);
// //         for(int i[]:a)
// //         {
// //             for(int j:i)
// //             {
// //                 System.out.print(j+"   ");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }
// // class brain
// // {
// //     void brains()
// //     {
// //         Scanner scan = new Scanner(System.in);
// //         System.out.println("Enter the size of matrix :");
// //         int size = scan.nextInt();
// //         Matrix m = new Matrix();
// //         int matrix1[][] = new int[size][size]; 
// //         int matrix2[][] = new int[size][size];
// //         System.out.println("Enter the first matrix :");
// //         matrix1 =m.enterMatrix(size); 
// //         System.out.println("Enter the second matrix :");
// //         matrix2 =m.enterMatrix(size);
// //         printMatrix p = new printMatrix();
// //         System.out.println("So the first matrix is");
// //         p.printMatrixx(matrix1);
// //         System.out.println("And second matrix is");
// //         p.printMatrixx(matrix2);
// //         System.out.println("Matrix multiplication is processing...");
// //         printans q = new printans();
// //         System.out.println("So your answer is");
// //         q.printanss(matrix1, matrix2, size);
// //     }
// // }


// import java.util.Scanner;
// public class Hello
// {
//     public static void main(String[] args)
//     {
//         System.out.println("Enter the size of matrix");
//         Scanner scan = new Scanner(System.in);
//         int size = scan.nextInt();
//         int ar1[][]= new int[size][size];
//         int ar2[][]= new int[size][size];
//         System.out.println("Enter the first matrix");
//         for(int i=0; i<size; i++)
//         {
//             for(int j=0; j<size; j++)
//             {
//                 ar1[i][j] = scan.nextInt();
//             }
//         }
//         System.out.println("Enter the second matrix");
//         for(int i=0; i<size; i++)
//         {
//             for(int j=0; j<size; j++)
//             {
//                 ar2[i][j] = scan.nextInt();
//             }
//         }
//         System.out.println("So the first matrix is");
//         for(int i[]:ar1)
//         {
//             for(int j:i)
//             {
//                 System.out.print(j+" ");
//             }
//             System.out.println(" ");
//         }
//         System.out.println("So the second matrix is");
//         for(int i[]:ar2)
//         {
//             for(int j:i)
//             {
//                 System.out.print(j+" ");
//             }
//             System.out.println(" ");
//         }
//         int ar3[][]=new int [size][size];
//         System.out.println("Matrix multiplication is processing");
//         for(int i=0; i<size; i++)
//         {
//             for(int j=0; j<size; j++)
//             {
//                 int a=0;
//                 for(int k=0; k<size; k++)
//                 {
//                     a=a+ar1[i][k]*ar2[k][j];
//                 }
//                 ar3[i][j]=a;
//             }
//         }     
//         System.out.println("So your answer is ");
//         for(int i[]:ar3)
//         {
//             for(int j:i)
//             {
//                 System.out.print(j+"   ");
//             }
//             System.out.println();
//         }  
//     }
// }