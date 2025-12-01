bool comp(int frq[],int fr[]){
   int b=0;
   for(int i=0;i<26;i++){
       if(frq[i]==fr[i])
       b++;
   }
   if(b==26)
   return true;
   else 
   return false;
}
void Findocc(char *s,char *t,int frq[],int fr[]){
    for(int i=0;s[i]!='\0';i++){
        frq[s[i]-'a']++;
    }
    for(int i=0;t[i]!='\0';i++){
        fr[t[i]-'a']++;
    }
}
bool isAnagram(char* s, char* t) {
    int frq[26]={0},i;
    int fr[26]={0};
    Findocc(s,t,frq,fr);
if(comp(frq,fr))return true;
else
return false;
}