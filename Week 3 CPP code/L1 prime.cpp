#include <iostream>
using namespace std;

int main() {
    int number;
    cin >> number;

    if (number <= 1) {
        cout << "Not Prime";
        return 0;
    }

    for (int i = 2; i < number; i++) {
        if (number % i == 0) {
            cout << "Not Prime";
            return 0;
        }
    }

    cout << "Prime";

    return 0;
}