//example on developing external functions (funs.js)

//defining a function to find sum of two numbers
function add(x, y)						
{
	return x+y;
} 

//defining a function to check the given number is prime or not
function isPrime(num)
{
	let i, found=false;
	num=+num;
	for(i=2; i<=num/2; i++)
	{
		if(num%i===0) {
			found=true;
			break;
		}
	}
	return (found===true) ? false : true ;
	/*			OR
	let i, count=0.;
	for(i=1; i<=num; i++)
	{
		if(num%i===0)
			count++;
	}
	if(count===2)
		return true;
	else
		return false;		*/
}