## Testing Plan for Test Repo 2

####Test Case:  01 - JUnit Test  
Description: Main functionality testing  
Steps (if any):
- Clone the repository
- Execute "mainTest" Java Unit Test  

Input: "Hi Aris"  
Expected Output: "Hi Aris"

####Test Case:  02 - Automated Maven Test in GitHub  
Description: Main functionality testing with Maven as GitHub Action 
Steps (if any):
- Create the testing workflow like [this](../.github/workflows/test.yml)
- Upload the commited changes to GitHub to trigger automated testing

Input: "Hi Aris"  
Expected Output: "Hi Aris"