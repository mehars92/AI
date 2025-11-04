#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
 pid_t pid1, pid2;

pid1 = fork(); 
    if (pid1 == 0) {
        printf("First child process: PID = %d\n", getpid());
   return 0;
    } 
else {
 pid2 = fork(); 

  if (pid2 == 0) {
       printf("Second child process: PID = %d\n", getpid());
     return 0;
  } 
  else {
       
 waitpid(pid1, NULL, 0);
 waitpid(pid2, NULL, 0);
  printf("Parent: Both children have finished.\n");
     }
}
return 0;
}

