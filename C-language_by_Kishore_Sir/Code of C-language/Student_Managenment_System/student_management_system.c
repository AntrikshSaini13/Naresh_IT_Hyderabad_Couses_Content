Binary files with project:
#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<stdlib.h>
struct stu
{
int id;
char name[20];
}
s;
FILE *fp;
FILE *t;
int idno, op, found;
char sname[20],ch;
void newstu(); /* fun dec */
void enquiry();

void report();
void upd();
void del();
void line()
{
puts("--------------------------------------------------------------------
-");
}
void main()
{
clrscr();
line();
puts("\t\t\t STUDENTS ENROLLMENT SYSTEM");
line();
puts("\t\t\t 1. New stu");
puts("\t\t\t 2. Enquiry");
puts("\t\t\t\t i. id wise");

puts("\t\t\t\t ii. name wise");
puts("\t\t\t 3. Report");
puts("\t\t\t 4. Update");
puts("\t\t\t 5. Delete");
puts("\t\t\t 6. Exit");
line();
printf("\t\t\t Enter ur option[ ]\b\b");
scanf("%d",&op);
switch(op)
{
case 1:
newstu(); /* fun calling */
break;
case 2:
enquiry();
break;
case 3:

report();
break;
case 4:
upd();
break;
case 5:
del();
break;
case 6:
return;
default:
puts("Invalid option");
}
getch();
main();
}

void newstu() /* fun def */
{
clrscr();
fp = fopen("2pmstu","a");
while(1)
{
flushall();
printf("Enter stu id ");
scanf("%d",&s.id);
flushall();
printf("Enter stu name ");
gets(s.name);
fwrite(&s,sizeof(s),1,fp);
puts("1 row created");
flushall();
printf("Next stu [y/n] ");
scanf("%c",&ch);

if(ch=='n'||ch=='N')break;
}
fclose(fp);
}

void enquiry()
{
int opt;
clrscr();
found=0;
fp = fopen("2pmstu","r");
puts("\t\t\t\t Enquiry");
line();
puts("\t\t\t\t 1. id wise");
puts("\t\t\t\t 2. name wise");
puts("\t\t\t\t 3. home page");

puts("\t\t\t\t 4. exit");
line();
printf("\t\t\t\t Enter ur option ");
scanf("%d",&opt);
if(opt==1)
{
printf("Enter stu id to search ");
scanf("%d",&idno);
fread(&s,sizeof(s),1,fp);
while(!feof(fp))
{
if(idno==s.id)
{
found=1;
puts("Id\tName");
line();
printf("%d\t%s\n",s.id,s.name);

break;
}
fread(&s,sizeof(s),1,fp);
}
}
else if(opt==2)
{
printf("Enter stu name to search ");
scanf("%s",sname);
fread(&s,sizeof(s),1,fp);
while(!feof(fp))
{
if(stricmp(sname,s.name)==0)
{
found=1;
puts("Id\tName");
line();

printf("%d\t%s\n",s.id,s.name);
break;
}
fread(&s,sizeof(s),1,fp);
}
}
else if(opt==3)
main();
else if(opt==4)
exit(0);
else
{
puts("Invalid Option");
getch();
enquiry();
}
fclose(fp);

if(found==0)
puts("Stu not found");
}

void report()
{
clrscr();
fp=fopen("2pmstu","r");
if(fp==NULL)printf("No stu found");
else
{
puts("Id\tName");
line();
fread(&s,sizeof(s),1,fp);
while(!feof(fp))
{
printf("%d\t%s\n",s.id,s.name);

fread(&s,sizeof(s),1,fp);
}
fclose(fp);
}
}

void upd()
{
clrscr();
found=0;
fp = fopen("2pmstu","r+"); /* read and write */
printf("Enter stu id to update ");
scanf("%d",&idno);
fread(&s,sizeof(s),1,fp);
while(!feof(fp))
{
if(idno==s.id)

{
puts("Id\tName");
line();
printf("%d\t%s\n",s.id,s.name);
printf("Enter new id, name ");
scanf("%d %s",&s.id,s.name);
fseek(fp, ftell(fp)-sizeof(s),0); /* SEEK_CUR */
fwrite(&s,sizeof(s),1,fp);
puts("One row updated");
found=1;
break;
}
fread(&s,sizeof(s),1,fp);
}
fclose(fp);
if(found==0)
puts("Stu not found");

}

void del()
{
clrscr();
fp = fopen("2pmstu","r");
t = fopen("temp","w");
printf("Enter stu id to delete ");
scanf("%d",&idno);
fread(&s,sizeof(s),1,fp);
while(!feof(fp))
{
if(idno==s.id)
{
found=1;
puts("Id\tName");
line();

printf("%d\t%s\n",s.id,s.name);
}
else
fwrite(&s,sizeof(s),1,t);
fread(&s,sizeof(s),1,fp);
}
fclose(fp);
fclose(t);
flushall();
if(found==0)
puts("Stu not found");
else
{
printf("R u sure to delete [y/n] ");
scanf("%c",&ch);
if(ch=='y'||ch=='Y')
{

remove("2pmstu");
rename("temp","2pmstu");
puts("One row deleted");
}
else
puts("Operation cancelled");
}
}