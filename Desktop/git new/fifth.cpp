#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter a value for n: ";
    cin >> n;

    if (n < 2) {
        cout << "There are no prime numbers between 1 and " << n << "." << endl;
        return 0;
    }

    cout << "Prime numbers between 1 and " << n << " are: ";

    for (int i = 2; i <= n; ++i) {
        bool isPrime = true;

       
        for (int j = 2; j * j <= i; ++j) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            cout << i << " ";
        }
    }

    cout << endl;
    return 0;
}
