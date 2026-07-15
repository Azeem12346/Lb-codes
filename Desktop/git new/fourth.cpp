#include <iostream>
using namespace std;

int main() {
    int n;

   
    cout << "Enter the number of terms in the Fibonacci sequence: ";
    cin >> n;

    
    if (n <= 0) {
        cout << "Please enter a positive integer." << endl;
        return 1;
    }

    
    long long first = 0, second = 1;

    cout << "Fibonacci Sequence: ";

    for (int i = 0; i < n; ++i) {
        if (i == 0) {
            cout << first << " ";
        } else if (i == 1) {
            cout << second << " ";
        } else {
            long long next = first + second;
            cout << next << " ";
            first = second;
            second = next;
        }
    }

    cout << endl;
    return 0;
}
