#include <iostream>
using namespace std;
class Demo
{
    int x, y;
    public:
    void SetValue(int &a, int &b)
    {
        a = 100;
        x = a;
        y = b;
        Display();
    }
    void Display()
    {
        cout<< x << " " << y;
    }
};
int main()
{
    int x = 10;
    Demo d;
    d.SetValue(x, x);
    return 0;
}
