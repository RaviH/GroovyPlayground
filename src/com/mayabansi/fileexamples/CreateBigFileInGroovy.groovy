@Typed
package com.mayabansi.fileexamples
/**
 * Created by IntelliJ IDEA.
 * User: Ravi Hasija
 * Date: Aug 7, 2011
 * Time: 12:10:45 AM
 * To change this template use File | Settings | File Templates.
 */

final File outputFile = new File(/D:\code\IProjects\GroovyPlayground\BigFileInGroovy.txt/)

final Random rand = new Random()
final int totalMin = 1000
final float price = 69.99f

final long startTime = System.currentTimeMillis()
outputFile.withWriter('UTF-8') { writer ->
    for (final int i in 1..200000) {
        def accountNumber = rand.nextInt(1001011)
        def customerNumber = rand.nextInt(2002110)
        int totalMinsUsed = rand.nextInt(1000)
        int totalMinsAvail = totalMin - totalMinsUsed

        String line = "${accountNumber}, ${customerNumber}, ${totalMin}, ${totalMinsUsed++}, ${totalMinsAvail}, ${price}, John Smith\n"
        writer << (line)
    }

}
long endTime = System.currentTimeMillis()
println "Time taken: " + (endTime - startTime) + " msec"
