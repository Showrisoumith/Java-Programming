bool isAcronym(char ** words, int wordsSize, char * s){
char str[wordsSize];
int n = strlen(s);
if(n!=wordsSize)return false;
int j=0;
for(int i=0 ;i <wordsSize;i++){
    char c=words[i][0];
    if(c!=s[j])return false;
    j++;
}
return true;
}