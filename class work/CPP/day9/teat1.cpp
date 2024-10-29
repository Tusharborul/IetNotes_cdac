#include <iostream>  
#include <cstring>
using namespace std;  
int main()  
{  
 const char *names[5] = {"rohan","ram","rahul","rohit","rachana"};  
	for(int i=0;i<5;i++)  
    {
		 //cout << names[i  ] << endl; //*(names+i)
		// cout << &names[i] << endl; //(names+i)
	//	 cout<<*(*(names+i)+0)<<endl;
		for (int j = 0; j < strlen(names[i]); j++){
		
		// cout << names[i][j] << "\t";
			 cout<<*(*(names+i)+j) << "\t";
		
		}
		cout<<endl;
	}
	
}
