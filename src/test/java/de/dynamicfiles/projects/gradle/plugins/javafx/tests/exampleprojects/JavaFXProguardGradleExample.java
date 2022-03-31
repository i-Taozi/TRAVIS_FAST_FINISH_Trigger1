/*
 * Copyright 2016 Danny Althoff
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.dynamicfiles.projects.gradle.plugins.javafx.tests.exampleprojects;

import de.dynamicfiles.projects.gradle.plugins.javafx.tasks.internal.JavaDetectionTools;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.gradle.testkit.runner.BuildResult;
import org.gradle.testkit.runner.GradleRunner;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author Danny Althoff
 */
public class JavaFXProguardGradleExample extends ExampleProjectTest {

    @BeforeClass
    public static void readVersion() throws IOException {
        readVersionString();
    }

    @Test
    public void javafxProguardGradleJfxJar() {
        if( JavaDetectionTools.IS_JAVA_9 ){
            return;
        }
        GRADLE_VERSIONS_TO_TEST_AGAINST.forEach(gradleVersion -> {
            GradleRunner runner = GradleRunner.create().withGradleVersion(gradleVersion).forwardOutput();

            try{
                Path targetFolder = Files.createTempDirectory("javafx-gradle-plugin-tests-" + this.getClass().getSimpleName() + "-javafxProguardGradle");
                Path sourceFolder = new File("examples/javafx-proguard-gradle").toPath();
                // create copyto work on
                copyFolderRecursive(sourceFolder, targetFolder);

                writePluginVersionIntoBuildScript(targetFolder);

                // run build
                BuildResult buildResult = runner.withProjectDir(targetFolder.toAbsolutePath().toFile())
                        .withArguments("clean", "jfxJar", "--stacktrace")
                        .withDebug(true)
                        .build();
            } catch(IOException e){

            }
        });
    }

    @Test
    public void javafxProguardGradleJfxNative() {
        if( JavaDetectionTools.IS_JAVA_9 ){
            return;
        }
        GRADLE_VERSIONS_TO_TEST_AGAINST.forEach(gradleVersion -> {
            GradleRunner runner = GradleRunner.create().withGradleVersion(gradleVersion).forwardOutput();

            try{
                Path targetFolder = Files.createTempDirectory("javafx-gradle-plugin-tests-" + this.getClass().getSimpleName() + "-javafxProguardGradle");
                Path sourceFolder = new File("examples/javafx-proguard-gradle").toPath();
                // create copyto work on
                copyFolderRecursive(sourceFolder, targetFolder);

                writePluginVersionIntoBuildScript(targetFolder);

                // run build
                BuildResult buildResult = runner.withProjectDir(targetFolder.toAbsolutePath().toFile())
                        .withArguments("clean", "jfxNative", "--stacktrace")
                        .withDebug(true)
                        .build();
                // check result

                // jar outcome
                assertTrue(
                        Files.exists(targetFolder.resolve("build").resolve("libs").resolve("javafx-proguard-gradle.jar"))
                );
                // myProguardTask outcome
                assertTrue(
                        Files.exists(targetFolder.resolve("build").resolve("libs").resolve("javafx-proguard-gradle.out.jar"))
                );
                // jfxJar outcome
                assertTrue(
                        Files.exists(targetFolder.resolve("build").resolve("jfx").resolve("app").resolve("javafx-proguard-gradle-jfx.jar"))
                );
            } catch(IOException e){

            }
        });
    }

}
