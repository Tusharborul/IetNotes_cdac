//1)WRITE A CPP PROGRAM TO SWAP 2 VARIABLES WITHOUT USING 3RD VARIABLE.
//#include<iostream>
//using namespace std;
//int main()
//{
//	int x = 20;
//	int y = 50;
//	cout<<"Before swapping the value of X and Y :"<<x<<"and "<<y<<endl;
//	x = x+y;
//	y=x-y;
//	x=x-y;
//	cout<<"After swapping the value of X and Y :"<<x<<"and "<<y;
//}


//2)WRITE A CPP PROGRAM TO CHECK WHETHER THE GIVEN NUMBER IS PALINDROM OR NOT.
//#include<iostream>
//using namespace std;
// int main(){
// 	int no,rem,sum=0,temp;    
//	cout<<"Enter the Number=";    
//  	cin>>no;    
// 	temp=no;    
//	while(no>0)    
//	{    
// 		rem=no%10;    
// 		sum=(sum*10)+rem;    
// 		no=no/10;    
//	}    
//	if(temp==sum)    
//		cout<<"Number is Palindrome.";    
//	else    
//		cout<<"Number is not Palindrome.";   
//}
// 

//3)WRITE A CPP PROGRAM TO DISPLAY 1ST 25 PRIME NUMBER.
//#include <bits/stdc++.h>
//using namespace std;
//
//
//bool isPrime(int n)
//{
//    if(n == 1 || n == 0)
//	return false;
//    for(int i = 2; i < n; i++)
//      {
//       if(n % i == 0) 
//	   return false;
//      }
//    return true;
//}
//int main()
//{
//    int N = 100;
//	for(int i = 1; i <= N; i++)
//      {
//        if(isPrime(i)) 
//          {
//            cout << i << " ";
//          }
//    }
//
//    
//}


//4)WRITE A CPP PROGRAM TO DISPLAY FACTORIAL FROM NUMBER 5 TO 8.
//#include<iostream>
//using namespace std;
//int main()
//{
//	int x=5;
//	while(x<=8){
//	
//	int fact=1;
//	for (int i=1;i<=x;i++){
//		fact*=i;
//	}
//	cout<<fact<<" ";
//	x++;
//}
//}


//5)WRITE A CPP PROGRAM TO DISPLAY SUMMATION OF 
// EVEN AND ODD NUMBERS IN AN ARRAY OF INTEGERS.
//#include<iostream>
//using namespace std;
//
//int main(){
//	int sumEven=0;
//	int sumOdd=0;
//	int arr[10]={1,2,5,9,8,1,6,7,9,4};
//	for(int i=0;i<10;i++){
//		if(arr[i]%2==0){
//			sumEven+=arr[i];
//		}
//		else
//		sumOdd+=arr[i];
//	}
//	cout<<"sum of even :"<<sumEven<<endl<<"sum of odd :"<<sumOdd<<endl;
//}


//6)WRITE A CPP PROGRAM TO CHANGE THE CASE OF EACH CHARACTER IN A GIVEN STRING.
//#include<iostream>
//#include <cctype>
//#include <string.h>
//using namespace std;
//int main()
//{
//	string str;
//	cout<<"Enter the string :";
//	cin>>str;
//
//   int n=str.length();
//
//   for (int i=0;i<n;i++)
//   {
//   		 if (islower(str[i])) {
//            str[i] = toupper(str[i]);
//        }
//        else if (isupper(str[i])) {
//            str[i] = tolower(str[i]);
//        }
//        
//   }
//   cout<<str;
//}


// 7)Write a template function swap () to swap the variables of int, 
//char and complex types
// C++ program to implement 
// function templates 
//#include <iostream> 
//using namespace std;  
//template <class T> 
//int swap_numbers(T& x, T& y) 
//{ 
//	T t; 
//	t = x; 
//	x = y; 
//	y = t; 
//	return 0; 
//} 
//
//// Driver code 
//int main() 
//{ 
//	int a, b; 
//	a = 10, b = 20; 
//
//	// Invoking the swap() 
//	swap_numbers(a, b); 
//	cout << a << " " << b << endl; 
//	return 0; 
//}



//8)C++ Program to Find number of Digits in any number
//#include<iostream>
//using namespace std;
//
//int main()
//{
//	int num;
//	cout << "Enter a number: "<<endl;
//    cin >> num;
//    int digitcnt = 0;
//    while(num>0)
//    {
//        num = num/10; 
//        digitcnt++; 
//    }
//    
//    cout<<"Number of Digit is :"<<digitcnt;
//
//}


// 9)C++ Program to Reverse a Number
//#include <iostream>
//using namespace std;
//int main() {
//    int number, reversedNumber = 0, remainder;
//    cout << "Enter an integer: ";
//    cin >> number;
//    int originalNumber = number;
//    if (number < 0) {
//        number = -number; 
//    }
//    while (number != 0) {
//        remainder = number % 10;     
//        reversedNumber = reversedNumber * 10 + remainder; 
//        number /= 10;                  
//    }
//    if (originalNumber < 0) {
//        reversedNumber = -reversedNumber;
//    }
//    cout << "Reversed number: " << reversedNumber << endl;
//
//    return 0;
//}


//C++ Program to remove all special characters from a given string.
//#include <iostream>
//using namespace std;
//void removeSpecialCharacter(string s)
//{
//	for (int i = 0; i < s.size(); i++) {
//		if (s[i] < 'A' || s[i] > 'Z' && s[i] < 'a'
//			|| s[i] > 'z') {
//			s.erase(i, 1);
//			i--;
//		}
//	}
//	cout << s;
//}
//int main()
//{
//	string s = "hi@hgg81)9";
//	removeSpecialCharacter(s);
//}

