package Problem_1.Communication_Channel;

public class Com_Channel_Factory {
    public Com_Channel getChannel(String Channel)
    {
        if(Channel == null)
            return null;

        if(Channel.equalsIgnoreCase("broadband"))
        {
            return new Broadband();
        }
        else if(Channel.equalsIgnoreCase("mobile_internet"))
        {
            return new Mobile_Internet();
        }
        return null;
    }
}
