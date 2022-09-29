import java.util.*;



class IronMan{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr1[][]={{2,4,5},{1,3,6},{2,4,7}};

        IronMan ironMan=new IronMan();
       int finalArray[] = ironMan.ironManSolution(N, arr1); 
      
       System.out.println("Final output");
       for(int i=0;i<finalArray.length;i++){
        if(i==finalArray.length-1){
            System.out.print(finalArray[i]); 
        }
        else
            System.out.print(finalArray[i]+",");
       }
        

    }

    int [] ironManSolution(int N, int arr1[][]){
        int a[]=new int[N];
        for(int i=0;i<N;i++){
            a[i]=0;
        }
        // for(int i=0;i<N;i++){
        //     System.out.print(a[i]);
        // }
        // System.out.println();


        for(int j=0;j<arr1.length;j++){
            
                   int lowerlimit=arr1[j][0];
                   int upperlimit=arr1[j][1];
                   int number=arr1[j][2];
                //    System.out.print(lowerlimit);
                //    System.out.print(" ");
                //    System.out.print(upperlimit);
                //    System.out.print(" ");
                //    System.out.print(number);
                
                // System.out.println();


          a[lowerlimit]=a[lowerlimit]+number;
          a[upperlimit-1]=a[upperlimit-1]+number;


        }

        // for(int m=0;m<N;m++){
        //    System.out.print(a[m]+" ");
        // }

        int maxposition=0;
for(int l=0;l<a.length-1;l++){
    if(a[l]<a[l+1]){
        maxposition=l+1;
    }
}
int finalarray[]=new int[3];

    finalarray[0]=maxposition;
    finalarray[1]=maxposition+1;
    finalarray[2]=a[maxposition];
    // for(int m=0;m<3;m++){
    //     System.out.print(finalarray[m]);
    // }


// System.out.println(maxposition+" "+maxposition+1);
// System.out.println();
        return finalarray;


    }
}

