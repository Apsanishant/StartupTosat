# StartupTosat v1.0  [![](https://jitpack.io/v/Apsanishant/designerBottomNav.svg)](https://jitpack.io/#Apsanishant/designerBottomNav)

>To Add Using Gradle

>Step 1. Add the JitPack repository to your build file

>Open build.gradle(project)

Add Following Lines

```build.gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
>Step 2. Add the dependency
 ```build.gradle
 	dependencies {
	        implementation 'com.github.Apsanishant:StartupTosat:1.0'
	}
```

>To Add Using Maven
 
>Step 1. Add the JitPack repository to your build file

``` build.gradle
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
>Step 2. Add The Dependency

``` build.gradle
	<dependency>
	    <groupId>com.github.Apsanishant</groupId>
	    <artifactId>StartupTosat</artifactId>
	    <version>Tag</version>
	</dependency>
  ```
 > To Add Using sbt
 > Step 1. Add the JitPack repository to your build file
 > Add it in your build.sbt at the end of resolvers:
 > 
 ```build.gradle
     resolvers += "jitpack" at "https://jitpack.io"
 ```
 >Step 2. Add the dependency

```build.gradle
libraryDependencies += "com.github.Apsanishant" % "designerBottomNav" % "Tag"	
```

>Add Using leiningen

>Add it in your project.clj at the end of repositories:

```build.gradle
    :repositories [["jitpack" "https://jitpack.io"]]
    ```
 >Step 2. Add the dependency

```build.gradle
	:dependencies [[com.github.Apsanishant/designerBottomNav "Tag"]]	
  ```
  >Add These Lines
  
  ```build.gradle
  
   FirebaseMessaging.getInstance().subscribeToTopic("notification");
  
  toast.startUpToast(this, "Hello");
  
  ```
![0_q3SWg_ULe81NNdh6](https://user-images.githubusercontent.com/99231654/156521754-9f367e94-94d7-46e1-b21f-026930c0bc72.gif)
