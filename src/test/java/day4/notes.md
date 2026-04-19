# Xpath is an address of the element.

Session 24 - Selenium with Java: XPath Locators


===================================================================================================================

1. Introduction to XPath (0:06 - 10:49)
   XPath (XML Path Language) is a critical locator in Selenium used to navigate through elements and attributes in an XML/HTML document.
   It allows for locating elements based on their hierarchical relationship or specific attributes within the DOM.


2. Absolute vs. Relative XPath (22:30 - 24:40)
    
    // means search for the element at any level within the DOM(Document Object Model)

# Absolute XPath -- full xPath which starts from root element of html in the DOM tree, where it traverses through each nodes(tags/elements)
# Relative XPath -- only searches for exact element in the DOM, it uses attributes & tags.

# Examples --

Absolute XPath(full xPath) -- /html/body/div[6]/header/div[2]/div[2]/form/input
Relative XPath(partial xPath) -- //input[@id='small-searchterms']

The Document Object Model (DOM) is a programming interface for web documents (HTML or XML) that represents the page as a structured tree of nodes

      Feature	        Absolute XPath	                                Relative XPath
      Syntax	  Starts with single slash (/)	                Starts with double slash (//)
      Path	      Full path from the root (HTML) node	        Searches for the element anywhere in the DOM
      Structure	  Uses tag names strictly	                    Uses attributes and tags for efficiency
      Preference  Less preferred (fragile if DOM changes)	    Highly preferred (more robust)

# Why will we use Relative XPath always instead of Absolute XPath.

⇒ Suppose, if a developer do any UI changes, as it is very common in real world projects, as In absolute XPath,
    there is a hierarchy between each nodes, if any elements is added, removed or repositioned, then the in
   between node hierarchy in the DOM can be broken, the locator then wouldn't be able to find the element.

But, if we use Relative XPath, if there are any UI changes repositioned, then also the element will have the
the same attributes and we can directly locate the element.

3. Creating Relative XPath (31:22 - 50:29) -- 2 ways.

   Relative XPaths -- automatically via DevTools or SelectorHub.
   Relative XPaths -- manually.

Syntax -- tagname[@attribute = 'value']
         or 
         *[@attribute = 'value'] // if we not sure on the tagname or don't know.

         i. Single Attribute XPath :
            //img[@alt='nopCommerce demo store']  or //*[@alt='nopCommerce demo store']
 
         ii. Relative Xpath with multiple attribute
             boolean displayStatus = driver.findElement(By.xpath("//img[@alt='Picture for category Apparel'][@title='Show products in category Apparel']")).isDisplayed();
               System.out.println("Is the image displayed ? " + displayStatus);

         iii. Relative Xpath with 'and'  &  'or'  operator with multiple attributes.

        // and
        // works(both have to be true)
           driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).sendKeys("T-Shirts");


         iv. Relative Xpath with 'and'  &  'or'  operator with multiple attributes.

        // and
        // works(both have to be true)
           driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).sendKeys("T-Shirts");


      // or
        // works(only one attribute has to be true)
         driver.findElement(By.xpath("//input[@name='q' or @placeholder='abc']")).sendKeys("T-Shirts");


      v. Relative Xpath for inner text using text() method. No attribute needed like for h2 div label text. no @ required as it is no attribute

      boolean status = driver.findElement(By.xpath("//h2[text() = 'Welcome to our store']")).isDisplayed();
      System.out.println("Text found in page, Response : " + status);
   

4. XPath Functions & Operators (54:54 - 1:29:27)
   Logical Operators:
   AND: Both attributes must match (//input[@name='search' and @placeholder='Search']).
   OR: At least one attribute must match.
   Text Method: Locates elements by their inner text (//tagname[text()='value']). Note: This is different from Link Text as it does not require an `` tag.
   Contains Method: Useful for dynamic attributes or partial matching (//tagname[contains(@attribute, 'partial_value')]).
   Starts-with: Ensures the attribute begins with a specific sequence (//tagname[starts-with(@id, 'st')]).

5. Best Practices & Tips
   Stability: Once a build is stable, XPath expressions become more reliable (57:35).
   Dynamic Elements: When IDs or names change upon refresh, use contains() or starts-with() to handle the parts that remain constant (1:20:00).
   The Dot Operator: Using . inside contains() effectively refers to the current text node, similar to the text() method (1:43:29).