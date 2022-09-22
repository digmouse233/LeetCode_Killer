#include <fstream>
#include <iostream>
#include <iterator>
#include <list>
#include <vector>
using namespace std;

class Solution {
public:
    bool isPalindrome(string s) {
        if (s.size() <= 1){
            return true;
        }

        int left=0;
        int right=s.size()-1;
        while(left < right){
            while(left < right && !isalnum(s[left])){
                left++;
            } 
            while(left<right&&!isalnum(s[right])){
                right--;
            } 

            if(tolower(s[left]) != tolower(s[right])){
                return false;
            } 

            left++;
            right--;
        }
        return true;
    }
};