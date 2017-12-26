This is a template solution for Cucumber JVM, with PageObjectPattern (makes use of Page Factory and Picocontainer -for injecting the WebDriver-).

1. Use BaseDriver for WebDriver main interactions since PicoContainer injects this class only
2. List all the hooks under com.nucal/base/Hooks class.
3. All page/component objects should be under com.nucal/components
    3.1. Create a new package for all components
    3.2. List all the classes belonging to the same component under the same component package (For ex. ValidLogin.class & InvalidLogin.class should be both under Login package)
4. All step definitions are under com.nucal/step definitions/
    4.1. May make use of packages to subgroup classes if it becomes cumbersome to follow from classes only
5. Add any common methods under the com.nucal/commons, inc. any Selenium wrappers etc.    
   
Running Cases:
    1. To run all the features (and scenarios) just run the TestRunner class     
    2. Running a feature file alone is not working properly because of the plugin. So skip that.
    3. To run a specific scenario alone, just click "Run" from the right-click on that exact scenario
    
Consider while writing cases:
    1. Finding elements
        1.1. Use PageFactory
        1.2. Don't use any sort of brittle selectors
        1.3. If you have to use brittle selectors, ask from the development team for a more stable and unique selector
        1.4. Try using css when possible
    2. Create separate classes before it gets hard to follow
    3. Make sure every class has one purpose only
    4. Make everything reusable as much as possible // Add "//TODO:" if you cannot
    5. Don't write comments everywhere unless it is not clear from the code itself
    6. Always try to make the code easy to follow first instead of commenting on it (Let there be no need for a documentation that documents our documentation)
    7. Use custom methods for Selenium methods if you can make it easier to use or read
    8. Always handle errors/exceptions and log the details as much and as easy to read as possible
    9. Do not sleep the system to wait for elements
    
Git:
    1. After the first commit on the Git repo, mark the driver files as to ignore (if there the driver is not changed)    
    
     
   
