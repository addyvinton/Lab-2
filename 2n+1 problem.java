public class Problem2{
	int number = 56;		//this is the number given to the program
	System.out.println("The inserted number is " + number);		//prints the number given to the program
	for (i=0; number>1; i++){ //every loop the counter i will be increased by one, that is the total number of operations. continues as long as number is bigger than 1
		if (number%2 != 0){ //if number/2 does not have a remainder then
			number=number/2;  //the number will be redefined as the number itself divided by 2
			System.out.println("The current number is "+number);	//prints the number after dividing it by 2
		}
		else { 	//when the condition of the if statement does not apply (number is not even) then executes this part that
			number=number*3+1;	//multiplies the number by 3 and adds 1, redefines number to it.
			System.out.println("The current number is "+number);
		}
	System.out.println("The total number of operations was "+i)	//prints out the number of operations
}