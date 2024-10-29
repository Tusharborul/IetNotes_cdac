#include<iostream>
using namespace std;
int main(){
	int n,m;
	cout<<"enter the row and coloum of metrix "<<endl;
	cin>>n>>m;
	
	int arr1[n][m];
	cout<<"enter the array element of first metrix"<<endl;
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
		cin>>arr1[i][j];
		}
	}

		int arr2[n][m];
	cout<<"enter the array element of second metrix"<<endl;
	for(int i=0;i<m;i++){
	for(int j=0;j<m;j++){
		cin>>arr2[i][j];
		}
	}
	
	int arr3[n][m];
	cout<<"addition of metrix is "<<endl;
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			arr3[i][j]=	arr1[i][j]+	arr2[i][j];
		cout<<arr3[i][j]<<" ";
		}
		cout<<endl;
	}

	
};

