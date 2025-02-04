import "../MainContent/MainContent.css"
import image from "../assets/myprofile.jpg"
function MainContent(){
    return(
        <>
        <div class = "maincontent">
        <pre>
        {`
• Hi, I'm Mayank Gaur, a Full-Stack Developer and AI enthusiast with expertise in C++, Java, and JavaScript.

• I have solved over 450+ problems on platforms like LeetCode, GeeksforGeeks, and Coding Ninjas, focusing on problem-solving and algorithms.

• My projects include:
  - Trusty Tours: A fraud-free tourism platform ensuring safe and verified travel experiences.
  - E-Chikitsalaya: An AI-powered healthcare system aiming to enhance medical services.
  - YOLOv5 for Smart India Hackathon 2024: Developed AI-driven image recognition and automation tools.
  
• I've built intelligent applications and chatbots using technologies like OpenAI, cloud APIs, and computer vision.

• As Co-Director of the Technical Team at CodeSpace Club, I mentor developers, organize events, and actively contribute to the tech community.

• I have participated in multiple hackathons, gaining hands-on experience in rapid prototyping and problem-solving.

• I'm eager to explore emerging technologies, collaborate with innovative minds, and build impactful projects.

• My goal is to leverage technology to solve real-world problems efficiently, whether through AI, automation, or full-stack development.

• Feel free to connect with me for collaborations and discussions—let's build something great together!
`}



        </pre>
        </div>

        <img 
          src={image} 
          alt="My Profile" 
        //   style={{ width: "200px", borderRadius: "50%", marginTop: "15px" }} 
        height={"200px"}
        width={"200px"}
        />
        
        </>
    )
}

export default MainContent;