package com.sam.webtasks.client;

import com.sam.webtasks.basictools.Counterbalance;
import com.sam.webtasks.iotask2.IOtask2BlockContext;

public class Instructions {

	public static String Get(int index) {
		String i="";
		 
		switch(index) {
		case 0:
			i="In this experiment you will have a simple task to do.<br><br>"
                    + "You will see several yellow circles inside a box. "
                    + "Inside each circle will be a number. <br><br>"
                    + "You can move them around using your mouse. Your task is to drag them to the bottom "
                    + "of the box in sequence. "
                    + "Please start by dragging 1 all the way to the bottom. "
                    + "This will make it disappear. Then drag 2 to the bottom, then 3, "
                    + "and so on.<br><br>";
			break;
		case 1:
			i="Now you will continue the same task, but sometimes there will be something else to "
                    + "do.<br><br>As well as dragging each circle in turn to the "
                    + "bottom of the screen, there will sometimes be special "
                    + "circles that you should drag in another direction (left, top, or right) instead of towards the bottom.<br><br>"
                    + "These special circles will initially appear in a different colour "
                    + "when they are first shown on the screen, instead of yellow. This is an "
                    + "instruction telling you where they should go.<br><br>"
                    + "For example, suppose that the circle with 7 in it was first shown in blue "
                    + "when it appeared on the screen. That would be an instruction that "
                    + "when you get to 7 in the sequence, you should drag that circle "
                    + "to the blue side of the box (left) instead of the bottom.<br><br>"
                    + "You will still be able to drag any "
                    + "circle to the bottom of the box, but you should try to "
                    + "remember to drag these special circles to the instructed "
                    + "location instead.";
			break;
		case 2:
			i="You did not drag the special circle to the instructed side of the square.";
			break;
		case 3:
			i="Now it will get more difficult.<br><br>You will get 3 special circles that you have to remember.<br><br> "
					+ "Don't worry if you do not remember all of them. That's fine - just try to remember as many as you can.";
			break;
		case 4:
			i="Now it will get more difficult.<br><br>You will get 5 special circles that you have to remember.<br><br> "
					+ "Don't worry if you do not remember all of them. That's fine - just try to remember as many as you can.";
			break;
		case 5:
			i="Now it will get more difficult.<br><br>You will get 7 special circles that you have to remember.<br><br> "
					+ "Don't worry if you do not remember all of them. That's fine - just try to remember as many as you can.";
			break;
		case 6:
			i="Now we are going to explain a strategy that can make the task easier.<br><br>"
                    + "When you see a special circle, you can set a reminder by immediately dragging it to a "
                    + "different part of the box. For example, if a circle initially appeared in blue, you "
                    + "could immediately drag it next to the blue (left) side of the box. Then, when "
                    + "you get to that circle in the sequence its location would remind you where it is supposed "
                    + "to go. If you do this for all of the special circles it should be easy to remember them.<br><br>Please now try the task again, using this strategy to help you.";
			break;
		case 7:
			i="You need to respond correctly to at least 6 of the special circles to continue.";
			break;
		case 8:
			i="Now the experiment will start for real.<br><br>You will do the task 16 times and you will "
					+ "always be told whether you are going to get "
				+ "1, 3, 5, or 7 special circles to remember.<br><br>It is up to you whether to set reminders or just "
				+ "remember them with your own memory. Feel free to do whatever you prefer.";
			break;	
		case 9:
			i="Thank you. You have now completed this part of the experiment.<br><br>Your completion code "
					+ "is 123456.<br><br>Please click <a href='http://www.google.com'>THIS LINK</a> to continue.";
			break;
		}

		return(i);	
	}
	
	public static String InfoText() {
		return ("We would like to invite you to participate in this research project. "
                + "You should only participate if you want to; choosing not to take part "
                + "will not disadvantage you in any way. Before you decide whether you "
                + "want to take part, please read the following information carefully and "
                + "discuss it with others if you wish. Ask us if there is anything that "
                + "is not clear or you would like more information.<br><br>"
                + "We are recruiting volunteers to "
                + "take part in an experiment aiming to improve our understanding of human "
                + "attention and memory. You will see various stimuli on the screen like letters of the alphabet "
                + "and you will be asked to respond to them by pressing keys. Sometimes you will be asked how "
                + "confident you are in your ability to perform the task. "
                + "The experiment "
                + "will last approximately 1 hour and you will receive a payment of £7.50 via the "
                + "Prolific Academic payment system. There are no anticipated risks or "
                + "benefits associated with participation in this study.<br><br>"
                + "It is up to you to decide whether or not to take part. If you choose "
                + "not to participate, you won't incur any penalties or lose any "
                + "benefits to which you might have been entitled. However, if you do "
                + "decide to take part, you can print out this information sheet and "
                + "you will be asked to fill out a consent form on the next page. "
                + "Even after agreeing to take "
                + "part, you can still withdraw at any time and without giving a reason. If you withdraw before the "
                + "end of the experiment, we will not retain your data and it will not be analysed."
                + "<br><br>All data will be collected and stored in accordance with the General Data Protection "
                + "Regulations 2018. Personal information is stored separately from test results, and researchers "
                + "on this project have no access to this data. Your personal information such as name and email "
                + "address is held by Prolific Academic but the researchers on this project have no acccess "
                + "to this. Data from this experiment may be made available to the research community, for example by "
                + "posting them on websites such as the Open Science Framework (<a href=\"http://osf.io\">http://osf.io</a>). "
                + "It will not be possible to identify you from these data.<br><br>"
                + "We aim to publish the results of this project in scientific journals and book chapters. Copies of the "
                + "results can either be obtained directly from the scientific journals' websites or from us.<br><br>"
                + "Should you wish to raise a complaint, please contact the Principal Investigator of this project, "
                + "Dr Sam Gilbert (<a href=\"mailto:sam.gilbert@ucl.ac.uk\">sam.gilbert@ucl.ac.uk</a>). However, "
                + "if you feel your complaint has not been handled to your satisfaction, please be aware that you can "
                + "also contact the Chair of the UCL Research Ethics Committee (<a href=\"mailto:ethics@ucl.ac.uk\">ethics@ucl.ac.uk</a>).");
    }

}
