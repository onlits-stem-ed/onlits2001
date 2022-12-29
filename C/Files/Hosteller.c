#include <stdio.h>
#include <stdlib.h>

void menu();
void list_hostellers();
void new_hosteller();

int main()
{
    menu();
    return 0;
}

void menu()
{
    int ch;
    printf("MAIN MENU\n");
    printf("1. Display Records\n");
    printf("2. New Hosteller\n");
    printf("Enter your choice (0 to exit): ");
    scanf("%d%*c", &ch);
    switch (ch)
    {
    case 0:
        printf("\nBye!\n");
        exit(0);
        break;
    case 1:
        list_hostellers();
        break;
    case 2:
        new_hosteller();
        break;
    default:
        printf("\nInvalid option!\n");
        menu();
    }
}

void display_records()
{

    menu();
}

void new_hosteller()
{
    char name[30], gender[7], mobile[11];
    FILE *fp;
    fp = fopen("Hosteller.123", "a");
    printf("Enter Name: ");
    scanf("%[^\n]", name);
    printf("Enter Gender: ");
    scanf("%s", gender);
    printf("Enter Mobile Number: ");
    scanf("%s", mobile);

    // Storing above information into file
    fprintf(fp, "%s,", name);
    fprintf(fp, "%s,", gender);
    fprintf(fp, "%s\n", mobile);

    fclose(fp);
    menu();
}

void list_hostellers()
{
    FILE *fp;
    char name[30], gender[7], mobile[11];
    fp = fopen("Hosteller.123", "r");

    printf("+--------------------------------------------------------+\n");
    printf("| %-30s%-10s%-15s|\n", "Name", "Gender", "Mobile Number");
    printf("+--------------------------------------------------------+\n");
    while(1)             //Condition to check end of file
    {
        fscanf(fp, "%[^,]", name);      
        if(feof(fp))                    //A good example of breaking using if
            break;
        fscanf(fp, ",%[^,]", gender);
        fscanf(fp, ",%[^\n]%*c", mobile);

        printf("| %-30s%-10s%-15s|\n", name, gender, mobile);
    }
    printf("+--------------------------------------------------------+\n");
    fclose(fp);
    menu();
}