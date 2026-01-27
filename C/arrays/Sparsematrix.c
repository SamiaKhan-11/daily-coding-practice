#include<stdio.h>
int main(){
    int a[10][10],SM[3][10],r,c,i,j,k=0,count=0;
    printf("Number of rows : ");
    scanf("%d",&r);
    printf("Number of cols : ");
    scanf("%d",&c);
    printf("Enter array elements : ");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            scanf("%d",&a[i][j]);
            if(a[i][j]!=0){
            SM[0][k]=i;
            SM[1][k]=j;
            SM[2][k]=a[i][j];
            k++;
            count++;
            }

        }
    }
    printf("Print the Sparse Matrix : \n");
    for(i=0;i<3;i++){
        for(j=0;j<count;j++){
            printf(" %d ",SM[i][j]);
        }
        printf("\n");
    }
    return 0;
}