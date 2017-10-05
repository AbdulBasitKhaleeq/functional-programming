

object main {
  
  def main(args: Array[String]){
    //task1()
    task3()
    
    println(" A=true and B= false")
    val A=true
    val B=true
    println("And Operation: "+ _and(A,B))
    println("XOR Operation: "+ _xor(A,B))
    println("NAND Operation: "+ _nand(A,B))
    
  }
  
  def task1(){
    println("1.	*Find out the last Nth element in a randomly generated list.");
    println("Enter number for elements in list:");
    val rands_no=scala.io.StdIn.readInt()
    
    //random list of user entered number of elements having number between 0-100.
    
    val z = List.fill(rands_no)(100).map(scala.util.Random.nextInt)
    
    println(z)
    
    //user enter a number. he put 4 for 4th element from last
    println("Enter index of number from last: ");
    val user_pos=scala.io.StdIn.readInt()
    
    println("res: "+lastNth(user_pos, z) )
  
    
  }
 
  
  def lastNth(a :Int, l: List[Int]):Int={
    //returning size - user inputed number.
    return l(l.size-a)
  }
  
  def lastNth_tr(acc :Int, l: List[Int]):Int={  
      lastNth_tr(acc, l)
  }
  
  
  def task3(){
    println("Enter number to check is it prime or not: ")
    val user_num=scala.io.StdIn.readInt()
    println("res3: Boolean = " + isPrime(1,user_num))
  }
  //Determine whether a given integer number is prime or not
def isPrime(a:Int,b:Int) :Boolean={

if (b==a){
  return true
}
if(b%a==0){
  return false
}
  isPrime(a+1,b)

}
  
  
  def task4(){
    println("numbers are coprime?\nEnter 1st number: ")
    
    val user_num1=scala.io.StdIn.readInt()
    println("\nEnter 2nd number: ")
    val user_num2=scala.io.StdIn.readInt()
    
  }
  
  
def _xor(a:Boolean,b:Boolean):Boolean={
  if(a==b)
    false
  else
    true
}

def _nand(a:Boolean,b:Boolean):Boolean={
   return _not(_and(a,b))
}  


  def _or(a:Boolean,b:Boolean):Boolean={
    
    if(a == true || b==true)
    return true
    else
      return false
  }
  
  def _not(a:Boolean):Boolean={
    
    if(a == true)
    return false
    else
      return true
  }
  
  def _and(a:Boolean,b:Boolean):Boolean={
    
    if(a == true && b==true)
    return true
    else
      return false
  }
}