#include<iostream>
using namespace std;
int main(){
int n;
cin>>n;
float * ptr;
ptr=new float[n];

for(int i=0;i<n;i++){
	int a;
	cin>>a;
	ptr[i]=a;
}

   for(int i=0;i<n;i++){
	cout<<ptr[i];
}
delete ptr;


}



