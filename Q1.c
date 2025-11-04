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
 printf("Child Process: PID = %d, Parent PID = %d\n", getpid(), getppid());
    } 
 else {
      
wait(NULL); 
printf("Parent Process: Child has finished.\n");
    }




    return 0;
}

