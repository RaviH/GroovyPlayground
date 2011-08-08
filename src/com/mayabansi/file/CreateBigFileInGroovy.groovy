@Typed package com.mayabansi.file
/**
 * Created by IntelliJ IDEA.
 * User: Ravi Hasija
 * Date: Aug 7, 2011
 * Time: 12:10:45 AM
 * To change this template use File | Settings | File Templates.
 */

final File outputFile = new File(/D:\code\IProjects\GroovyPlayground\BigFileInGroovy.txt/)

Random rand = new Random()
int accountNumber = 1
int customerNumber = 1001101
int totalMin = 1000
float price = 69.99f

long startTime = System.currentTimeMillis()
for (i in 1..200000) {
    accountNumber = rand.nextInt(1001011)
    customerNumber = rand.nextInt(2002110)
    int totalMinsUsed = rand.nextInt(1000)
    int totalMinsAvail = totalMin - totalMinsUsed

    String line = "${accountNumber}, ${customerNumber}, ${totalMin}, ${totalMinsUsed++}, ${totalMinsAvail}, ${price}, John Smith\n"
    if (i == 1) {
        outputFile.write(line)
    } else {
        outputFile.append(line)
    }
}
long endTime = System.currentTimeMillis()
println "Time taken: " + (endTime - startTime) + " msec"
