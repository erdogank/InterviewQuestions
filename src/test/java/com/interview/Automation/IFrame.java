package com.interview.Automation;

public class IFrame {

    /**
     * - What is an iframe?
     * - An iframe is HTML within another HTML page.
     * - Most of the time it is used to create independent sections in a page for advertisements, maps, video content or anything independent.
     *
     * - How do we handle iframes?
     * - Selenium WebDriver can focus on one thing at a time.
     * - Therefore we must switch its focus from the default <html> to iframe <html> before being able to do any action inside of it.
     *
     * - What happens if we do not switch to inner frame?
     * - If we try to locate any web element before switching, we will get NoSuchElementException
     *
     * - How many ways we have to switch to inner iframe?
     *     #1- by index:
     *         - starts from 0
     *         - we count
     *
     *     syntax: driver.switchTo().frame(index);
     *
     *     #2- by id-name value
     *         - if there is id or name attribute we can just pass their values as a string
     *
     *     syntax: driver.switchTo().frame("id-name value");
     *
     *     #3- by locating it as a web element
     *         - we locate the iframe tag itself as a web element and pass it into the method.
     *
     *     syntax: driver.switchTo().frame(WebElement);
     *     syntax: driver.switchTo().frame(driver.findElement(By.locator));
     *
     * - How do we go switch driver's focus to default iframe?
     *     driver.switchTo().parentFrame();
     *     driver.switchTo().defaultContent();
     *
     *
     * 1    <html>
     *
     * 2        <html>
     * 3            <html> --> driver.switchTo().parentFrame(); --> will focus to 2
     *             </html> --> driver.switchTo().defaultContent(); --> will focus to #1
     *         </html>
     *
     * 4        <html>  --> driver.switchTo().parentFrame(); --> will focus to #1
     *         </html> --> driver.switchTo().defaultContent(); --> will focus to #1
     *
     *
     *     <html>
     *
     * - The only time parentFrame() method and defaultContent() method will make any difference in use is if we have iframe inside of another iframe.
     * - Otherwise if we have 1 layer of iframe they will both switch back to default html
     */
}
