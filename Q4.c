#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
int main() {
 pid_t pid = fork();
 if (pid < 0) {
   perror("fork failed");
    return 1;
    } 
else if (pid == 0) {
   printf("Child: PID = %d\n", getpid());
      sleep(11); 
     printf("Child: Finished work.\n");
    } 
 else {
 wait(NULL);
  printf("Parent: Child finished.\n");
 }
return 0;



}

