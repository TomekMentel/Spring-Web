call runcrud.bat
 if "%ERRORLEVEL%" == "0" goto startchrome
   echo.
   echo RUNCRUD has errors - breaking work
   goto fail

   :startchrome
     @echo off
    cd "C:\Program Files (x86)\Google\Chrome\Application\"
    start chrome.exe

   if "%ERRORLEVEL%" == "0" goto url
      echo.
      echo RUNCRUD has errors - breaking work
      goto fail

      :url
      @START http://localhost:8080/crud/v1/task/getTasks/
      if "%ERRORLEVEL%" == "0" goto end
         echo.
         echo RUNCRUD has errors - breaking work
         goto fail

:fail
 echo.
 echo There were errors

 :end
 echo.
 cd C:\Users\Admin\Documents\Development\Projects\task
 echo Work is finished.

