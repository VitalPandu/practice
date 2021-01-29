package com.automate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface Saveable {
     List<String> write();
     void read(List<String> savedValues);

}

