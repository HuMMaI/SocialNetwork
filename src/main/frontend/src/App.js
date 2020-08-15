import React from 'react';
import './App.css';

const App = () => {
    return (
        <div className="App">
            <header className="header">
                <div className="header-menu-btn">Main page</div>
                <div className="header-menu-btn">News</div>
                <div className="header-menu-btn">Messages</div>
                <div className="header-menu-btn">Friends</div>
            </header>

            <div className="content">
                <div className="other">

                </div>

                <div className="post-box">
                    <div>
                        <form action="" className="post-form">
                            <textarea cols="100" rows="5" className="post-textarea"></textarea>
                            <input type="submit" value="Create post"/>
                        </form>
                    </div>

                    <div className="post-list">

                    </div>
                </div>
            </div>

            <footer className="footer">
                footer
            </footer>
        </div>
    );
};

export default App;
