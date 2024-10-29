#include <iostream>
using namespace std;

class Demo
{
    int rollno;
    int marks[5];

public:
    void get()
    {
        cout << "Enter roll number:\n";
        cin >> rollno;
        cout << "Enter marks for 5 subjects:\n";
        for (int i = 0; i < 5; i++)
        {
            cin >> marks[i];
        }
    }

    void show()
    {
        cout << "Roll Number: " << rollno << endl;
        cout << "Marks: ";
        for (int i = 0; i < 5; i++)
        {
            cout << marks[i] << " ";
        }
        cout << endl;
    }
};

int main()
{
    Demo d1[3];

    for (int i = 0; i < 3; i++)
    {
        cout << "Data for student " << (i + 1) << ":\n";
        d1[i].get();
        cout << "Displaying data for student " << (i + 1) << ":\n";
        d1[i].show();
    }

    return 0;
}

