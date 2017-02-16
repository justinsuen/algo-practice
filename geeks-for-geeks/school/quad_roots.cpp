//quad roots: http://www.practice.geeksforgeeks.org/problem-page.php?pid=607

#include <iostream>
#include <math.h>
#include <cmath>
using namespace std;

int main() {
    int t, a, b, c;
    float r1, r2;
    
    cin >> t;
    while(t--){
        cin >> a >> b >> c;
        if(a==0){
            cout << "Invalid" << endl;
        } else if((pow(b,2) - 4*a*c) < 0){
            cout << "Imaginary" << endl;
        } else{
            r1 = (-b + sqrt(pow(b,2) - 4*a*c))/(2*a);
            r2 = (-b - sqrt(pow(b,2) - 4*a*c))/(2*a);
            cout << floor(r1) << " " << floor(r2) << endl;
        }
    }
	return 0;
}