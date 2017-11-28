#Compiling
use the following command from the root of the repo to compile:

`javac -cp ./gson/gson-2.8.3-SNAPSHOT.jar:./lang3/commons-lang3-3.7.jar:. -d ../bin/production/ProjectThree ./pkg/*.java`

use the following command from the `bin/production/ProjectThree` directory to run:

`java -cp ./gson/gson-2.8.3-SNAPSHOT.jar:./lang3/commons-lang3-3.7.jar:. pkg.Main`