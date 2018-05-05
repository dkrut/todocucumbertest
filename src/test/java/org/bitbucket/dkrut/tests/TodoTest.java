package org.bitbucket.dkrut.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Denis Krutikov on 05.05.2018.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/org/bitbucket/dkrut/features",
        glue = "org.bitbucket.dkrut",
        format = "pretty",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE
)

public class TodoTest {
}
