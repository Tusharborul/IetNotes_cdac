//sqrt() function
/*
#include <cmath>
#include <iostream>
using namespace std;
int main()
{
    double answer;
    answer = sqrt(12); //(-30) :- o/p is nan
    cout << "Square root of " << " is " << answer;
     return 0;
}
*/

/*
//abs(int)function 

#include <math.h>
#include <iostream>
 using namespace std;
 
int main()
{
    int val1, val2;
 
    /// finding absolute value using
    /// abs() function.
    val1 = abs(2.7);
    val2 = abs(-43);
 
    cout << "abs(8.90) = " << val1 << "\n";
    cout << "abs(-78) = " << val2 << "\n";
    return 0;
}
*/
/*
//double pow(double, double)
#include <iostream>  
#include<cmath>  
using namespace std;  
int main()  
{  
int base=9;  
  int exponent=2;  
  int power=pow(base,exponent);  
  std::cout << "Power of a given number is :" <<power;  
  return 0;  
}
*/

//Math ceil()
#include <iostream>  
#include<cmath>  
using namespace std;  
int main()  
{  
  float x=11;  
  std::cout << "Initial value of x is :"<<x;  
  cout<<'\n';  
  cout<<"final value of x is :"<<ceil(x);  
  return 0;  
}    
