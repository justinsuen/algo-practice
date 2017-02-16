//sorted array: http://www.practice.geeksforgeeks.org/problem-page.php?pid=609

#include <iostream>
using namespace std;

int sorted(int C[], int N){
    for(int i=0; i<N; i++){
	    if(C[i]>C[i+1] && i+1<N){
	        return 0;
	    }
	}
	return 1;
}

int main() {
    int C[500], T, N;
    
	//read number of test cases
	cin >> T;
	
	//go through cases
	while(T--){
	    cin >> N;
	    
	    //read array
	    for(int i=0; i<N; i++){
	        cin >> C[i];
	    }
	    cout << sorted(C, N) << endl;
	}
	return 0;
}