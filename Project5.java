package project5;
//Dustin Scott
public class Project5 {
  public static void quicksort(int[] a) {
    int p=0,q,r=0;
  }
  
  public static void quicksortHoarePartition(int[] a) {
      
  }
  
  static int partition(int a[],int p,int r) {
    int part=0;
    
    return part;  
  }
  
  static void quicksort(int[] a,int p,int r) {
    
    if (p<r) {
      int q=partition(a,p,r);
      quicksort(a,p,q-1);
      quicksort(a,q+1,r);
    }
  }
  
  public static void main(String[] args) {
    
  }    
}