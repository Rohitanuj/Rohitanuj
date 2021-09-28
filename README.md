- 👋 Hi, I’m @Rohitanuj
- 👀 I’m interested in ...
- 🌱 I’m currently learning ...
- 💞️ I’m looking to collaborate on ...
- 📫 How to reach me ...

<!---
Rohitanuj/Rohitanuj is a ✨ special ✨ repository because its `README.md` (this file) appears on your GitHub profile.
You can click the Preview link to take a look at your changes.
--->

#include <stdio.h>

int main()
{
    long a[3][3]={{2,4,5},{4,5,32}};
    int i=0;
    int j=0;
    for(i=0;i<5;i++)
    {
        //printf("%d\n",a[i]);
        //printf("%d        %d  \n",a[i],&a[i]);

            for(j=0;j<5;j++)
            {
            printf("%d        %d  \n",a[j],&a[i][j]); 
            }    
    }
 
    return 0;
}
