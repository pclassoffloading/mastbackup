class DataItem{
    String mnumonic;
    String opcode;
    String formatN;


 public DataItem(String mnumonic, String opcode, String formatN){
     this.mnumonic = mnumonic;
     this.opcode = opcode;
     this.formatN = formatN;
 }//constructor DataItem


}//DataItem

class OPTAB{
 DataItem[] OPARRAY;
 int ArraySize;

 //The input of OPTAB is as string of all the mnumonics their opcode and their format#
 //ADD 18 3/4
 public OPTAB(String dictionary){

    //parse String Dictionary into tokens[]
    String delims = "[ ]+";
    String[] tokens = dictionary.split(delims);

    //get ArraySize as akin to a Hash Table
    ArraySize = getPrime(tokens.length/3);
    OPARRAY = new DataItem[ArraySize];//will create a prime sized array based on the number of mnumonics

    for(int i = 0; i < tokens.length; i=i+3){
        OPARRAY[hashFunc(tokens[i], ArraySize)] = new DataItem(tokens[i], tokens[i+1], tokens[i+2]);

    }//for



 }//constuctor OPTAB

   public int hashFunc(String key, int arraySize)
   {
      int hashVal = 0;
      for(int j=0; j<key.length(); j++)
      {
         int letter = key.charAt(j) - 96; //get char code
         hashVal = (hashVal * 26 + letter) % arraySize; //mod
      }
      return hashVal;
   }//hashFunc

   public static int getPrime(int min)
   {
      for(int j = min+1; true; j++)
      {
         if( isPrime(j) )
            return j;
      }//for
   }//getPrime

   public static boolean isPrime(int n)
   {
      for(int j = 2; (j*j <= n); j++)
      {
         if( n % j == 0)
            return false;
      }//for
      return true;
   }//iPrime


}//class OPTAB
