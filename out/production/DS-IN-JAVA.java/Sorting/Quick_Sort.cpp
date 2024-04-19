#include <vector>
#include <iostream>
using namespace std;
// 3
int partion(vector<int> &arr, int low, int high)
{
    int pivot = arr[low];
    int i = low;
    int j = high;
    while (i < j)
    {
        while (arr[i] <= pivot && i <= high)
        {
            i++;
        }
        while (arr[j] > pivot && j >= low)
        {
            j--;
        }
        if (i < j)
        {
            swap(arr[i], arr[j]);
        }

        swap(arr[low], arr[j]);
        return j;
    }
}
// 2
void qs(vector<int> &arr, int low, int high)
{
    if (low < high)
    {
        // partion index
        int pIndex = partion(arr, low, high);
        qs(arr, low, pIndex - 1);
        qs(arr, pIndex + 1, high);
    }
}
    // 1
    vector<int> quickSort(vector<int> arr)
    {
        qs(arr, 0, arr.size() - 1);
        return arr;
    }

    int main()
    {
        // 0
        vector<int> arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.size();
        cout << "Before Sorting: ";
        for (int i = 0; i < n; i++)
        {
            cout << arr[i] << " ";
        }
        cout << endl;
        arr = quickSort(arr);
        cout << "After Quick sort " << endl;

        for (int i = 0; i < n; i++)
        {
            cout << arr[i] << " ";
        }
        cout << endl;
        return 0;
    }
