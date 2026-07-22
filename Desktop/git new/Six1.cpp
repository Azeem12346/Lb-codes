#include <iostream>
using namespace std;

int main() {
    char ch;
    int ascii;

    cout << "Enter a character: ";
    cin >> ch;

    ascii = int(ch);
    if (ascii >= 65 && ascii <= 90) {
        cout << "It is a Capital Letter." << endl;
    }
    else if (ascii >= 97 && ascii <= 122) {
        cout << "It is a Small Case Letter." << endl;
    }
    else if (ascii >= 48 && ascii <= 57) {
        cout << "It is a Digit." << endl;
    }
    else if ((ascii >= 0 && ascii <= 47) ||
             (ascii >= 58 && ascii <= 64) ||
             (ascii >= 91 && ascii <= 96) ||
             (ascii >= 123 && ascii <= 127)) {
        cout << "It is a Special Symbol." << endl;
    }
    else {
        cout << "Invalid Character!" << endl;
    }
    cout << "\nSwitch-based classification:" << endl;

    switch (true) {
        case true:
            if (ascii >= 65 && ascii <= 90) {
                cout << "Capital Letter (via switch)." << endl;
                break;
            }
            if (ascii >= 97 && ascii <= 122) {
                cout << "Small Case Letter (via switch)." << endl;
                break;
            }
            if (ascii >= 48 && ascii <= 57) {
                cout << "Digit (via switch)." << endl;
                break;
            }
            if ((ascii >= 0 && ascii <= 47) ||
                (ascii >= 58 && ascii <= 64) ||
                (ascii >= 91 && ascii <= 96) ||
                (ascii >= 123 && ascii <= 127)) {
                cout << "Special Symbol (via switch)." << endl;
                break;
            }
            cout << "Invalid Character (via switch)." << endl;
            break;
    }

    return 0;
}


