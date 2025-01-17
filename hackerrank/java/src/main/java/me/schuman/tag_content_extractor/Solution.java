package me.schuman.tag_content_extractor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/tag-content-extractor/problem
 */
public class Solution {
    public static void extract(String line) {
        // Compile a regex pattern to match XML/HTML-like tags and extract their content
        // <(.+)> - Matches the opening tag and captures the tag name in group 1
        // ([^<]+) - Matches and captures the content between the opening and closing tags in group 2
        // </\\1> - Matches the corresponding closing tag (\\1 is a backreference to the first group)
        Pattern regex = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher matches = regex.matcher(line);

        // Check if there are any matches
        if (matches.find()){
            do {
                // Print the second group, which contains the content between the tags
                System.out.println(matches.group(2));
            } while (matches.find()); // Continue finding additional matches if they exist
        } else {
            // Print "None" if no matches are found
            System.out.println("None");
        }
    }
}
