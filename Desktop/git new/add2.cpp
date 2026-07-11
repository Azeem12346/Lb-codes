#include<iostream>
using namespace std;
int main()
{
	int a,b;
	cout<<"enter first number";
	cin>>a;
	cout<<"enter second  number";
	cin>>b;
	
	
		int carry = a & b;
		a= a ^ b;
		b= carry <<1;
		
	
cout<<a<<endl;

	return 0;
	
}
