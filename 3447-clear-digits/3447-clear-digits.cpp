class Solution { 
    public: string clearDigits(string s) {
        string result;
        for (char c : s) {
            if (isdigit(c)) { // If there is a previous non-digit character, remove it
                if (!result.empty() && !isdigit(result.back())) { 
                    result.pop_back(); 
                }
            }
            else {
                result.push_back(c); 
            } 
        } 
        return result; 
    }
};